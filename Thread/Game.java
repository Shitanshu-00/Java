package Thread;

class Animation extends Thread{
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Animation Cycle :" + i);
        }
    }
}
class Navigation extends Thread{
    public void run(){
        for (int i=0; i<=5; i++){
            System.out.println("Navigation Cycle :" + i);
        }
    }
}

class Score extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Score Cycle :" + i);
        }
    }
}

class Sound extends Thread {
        public void run() {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Sound Cycle :" + i);
            }
        }
}
class Game extends Thread{
    public static void main(String[] args) {
        Animation a= new Animation();
        Navigation n= new Navigation();
        Score s= new Score();
        Sound d= new Sound();
        a.start();
        n.start();
        s.start();
        d.start();

    }
}
