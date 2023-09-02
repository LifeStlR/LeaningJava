public class Triangle1{
    int num;
    Triangle1(String s[]){
        if(s.length > 0)
            setNum(Integer.parseInt(s[0]));
        else
            setNum(5);
    }

    public void setNum(int x){
        num = x;
    }

    public int getNum(){
        return num;
    }

    public void Show(){
        for(int i = 1; i <= getNum(); i++){
            for(int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangle1 t = new Triangle1(args);
        System.out.println("First Triangle Shape - Left Alignment");
        t.Show();
    }
}