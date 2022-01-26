
public class Expresiones {
    int exp(int a,int b){
        return b=a++;
    }
    int exp2(int c ,int d){
        return d = c++ + ++c;
    }
    int exp3(int e ,int f){
        return f= ++e + ++e;
    }
    int exp4(int g ,int h,int i){
        return i+=5 + --g*h++ -10*2+ ++h;
    }
}
