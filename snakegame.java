import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Random;

class SnakeGame extends JPanel implements ActionListener, KeyListener {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private static final int UNIT_SIZE = 20;
    private static final int DELAY = 100;

    private LinkedList<Point> snake;
    private Point food;
    private char direction;
    private boolean running;

    public SnakeGame() {
        snake = new LinkedList<>();
        snake.add(new Point(5, 5)); // Initial snake position
        direction = 'R'; // Initial direction (right)
        generateFood();

        setPreferredSize(new Dimension(WIDTH * UNIT_SIZE, HEIGHT * UNIT_SIZE));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        Timer timer = new Timer(DELAY, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkCollision();
            repaint();
        }
    }

    public void move() {
        Point head = snake.getFirst();
        Point newHead = (Point) head.clone();

        if (direction == 'U') {
            newHead.translate(0, -1);
        } else if (direction == 'D') {
            newHead.translate(0, 1);
        } else if (direction == 'L') {
            newHead.translate(-1, 0);
        } else if (direction == 'R') {
            newHead.translate(1, 0);
        }

        snake.addFirst(newHead);

        if (newHead.equals(food)) {
            generateFood();
        } else {
            snake.removeLast();
        }
    }

    public void checkCollision() {
        Point head = snake.getFirst();

        // Check if the snake hits the wall or itself
        if (head.x < 0 || head.x >= WIDTH || head.y < 0 || head.y >= HEIGHT || snake.contains(head)) {
            running = false;
            return;
        }
    }

    public void generateFood() {
        Random rand = new Random();
        int foodX, foodY;
        do {
            foodX = rand.nextInt(WIDTH);
            foodY = rand.nextInt(HEIGHT);
        } while (snake.contains(new Point(foodX, foodY)));

        food = new Point(foodX, foodY);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (running) {
            // Draw the food
            g.setColor(Color.RED);
            g.fillRect(food.x * UNIT_SIZE, food.y * UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);

            // Draw the snake
            g.setColor(Color.GREEN);
            for (Point p : snake) {
                g.fillRect(p.x * UNIT_SIZE, p.y * UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);
            }
        } else {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("Game Over", WIDTH * UNIT_SIZE / 2 - 100, HEIGHT * UNIT_SIZE / 2);
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if ((key == KeyEvent.VK_LEFT) && (direction != 'R')) {
            direction = 'L';
        } else if ((key == KeyEvent.VK_RIGHT) && (direction != 'L')) {
            direction = 'R';
        } else if ((key == KeyEvent.VK_UP) && (direction != 'D')) {
            direction = 'U';
        } else if ((key == KeyEvent.VK_DOWN) && (direction != 'U')) {
            direction = 'D';
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame();

        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        game.running = true;
    }
}