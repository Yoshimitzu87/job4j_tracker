package ru.job4j.oop;

public class BallStory {
    public static class Ball {
        public void tryRun(boolean condition) {
            if (condition) {
                System.out.println("Колобка съели!");
            } else {
                System.out.println("Колобок сбежал!");
            }
        }

        public static class Wolf {
            public void tryEat(Ball ball) {
                ball.tryRun(false);
            }
        }

        public static class Hare {
            public void tryEat(Ball ball) {
                ball.tryRun(false);
            }
        }

        public static class Fox {
            public void tryEat(Ball ball) {
                ball.tryRun(true);
            }
        }

        public static void main(String[] args) {
            Ball ball = new Ball();
            Wolf wolf = new Wolf();
            Hare hare = new Hare();
            Fox fox = new Fox();
            wolf.tryEat(ball);
            hare.tryEat(ball);
            fox.tryEat(ball);

        }
    }
}
