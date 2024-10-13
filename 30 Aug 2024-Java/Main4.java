class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
}

class Main4{
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        int add1 = obj.add(1,2);
        double add2 = obj.add(1.2,2.3);
        float add3 = obj.add((float)(4.5),(float)(5.5));

        System.out.println("Add1:" +add1);
        System.out.println("Add2:"+add2);
        System.out.println("Add2:"+add3);
    }
}

