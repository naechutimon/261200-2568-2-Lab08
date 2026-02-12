public class turtleLab8 extends Thread{
    private Turtle nenae;
    private int part;

    public turtleLab8(int part, double x ,double y , String color){
        this.part  = part;
        this.nenae = new Turtle(x,y);
        this.nenae.penColor(color);
        nenae.speed(10);
        nenae.hide();
    }

    @Override
    public void run(){
        if(part == 0){
            drawTree();
        } else if (part == 1){
            drawStar();
        } else if (part == 2){
            drawGift();
        } else if (part == 3) {
            drawBow();
        }
    }

    private void drawTree(){
        nenae.up();
        nenae.down();
        nenae.forward(240);
        nenae.left(120);
        nenae.forward(240);
        nenae.left(120);
        nenae.forward(240);
        nenae.left(120);

        nenae.up();
        nenae.setPosition(-90, -40);
        nenae.down();
        nenae.forward(180);
        nenae.left(120);
        nenae.forward(180);
        nenae.left(120);
        nenae.forward(180);
        nenae.left(120);

        nenae.up();
        nenae.setPosition(-60, 40);
        nenae.down();
        nenae.forward(120);
        nenae.left(120);
        nenae.forward(120);
        nenae.left(120);
        nenae.forward(120);
        nenae.left(120);

        nenae.penColor("brown");
        nenae.up();
        nenae.setPosition(-20, -120);
        nenae.down();
        nenae.forward(40);
        nenae.right(90);
        nenae.forward(80);
        nenae.right(90);
        nenae.forward(40);
        nenae.right(90);
        nenae.forward(80);
    }

    private void drawStar(){
        nenae.up();
        nenae.down();

        for (int i = 0; i < 5; i++) {
            nenae.forward(40);
            nenae.right(144);
        }
    }

    private void drawGift(){
        //
        nenae.up();
        nenae.down();

        for (int i = 0; i < 4; i++) {
            nenae.forward(60);
            nenae.left(90);
        }
    }

    private void drawBow(){
        nenae.up();
        nenae.down();
        nenae.left(90);
        nenae.forward(60);
        nenae.right(90);

        //
        nenae.up();
        nenae.setPosition(50, -170);
        nenae.down();
        nenae.forward(60);

        //
        nenae.up();
        nenae.setPosition(58, -140);
        nenae.down();

        for (int i = 0; i < 2; i++) {
            nenae.left(45);
            nenae.forward(15);
            nenae.right(90);
            nenae.forward(15);
            nenae.left(45);
        }
    }
}
