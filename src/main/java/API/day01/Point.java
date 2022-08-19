package API.day01;

public class Point {
    private int x;
    private int y;


    public int getX(){//getter获取值
        return x;
    }

    public void setX(int x){//setter设置值
        if (x >=0 ){
            this.x = x;
        }
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        if (y >= 0){
            this.y = y;
        }
    }
}
