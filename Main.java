class Geo{
    private int i;
    public void setColor(int i){
        this.i=i;
    }
    public int getColor(){
        return this.i;
    }
}
public class Main{
    public static void main(String args[]){
       Geo g1=new Geo();
       g1.setColor(1);
       System.out.println(g1.getColor());
    }
}