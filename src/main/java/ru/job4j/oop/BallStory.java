package ru.job4j.oop;

public class BallStory {
    public class Ball {
        public void tryRun(boolean condition) {
        }
    }

    public class Wolf {
        public void tryEat(Ball ball) {
            ball.tryRun(false);
        }
    }

    public class Hare {
        public void tryEat(Ball ball) {
            ball.tryRun(false);
        }
    }

    public class Fox {
        public void tryEat(Ball ball) {
            ball.tryRun(true);
        }
    }

    public static void main(String[] args) {
    }
}
