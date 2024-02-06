package res1;

public class HoraExacta extends Hora {

    int s;

    public HoraExacta(int h, int min, int s) {
        super(h, min);
        this.s = s;
    }
    
    public void incremento() {
        s++;
        if (s > 59) {
            super.incremento();
            s = 0;
        }
    }
    
    public String mostrar() {
        return super.mostrar() + ":" + s;
    }
}
