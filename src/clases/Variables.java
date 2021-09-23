package clases;

public class Variables {
    float radiotub;//radio del tubo
    float radiotq;//radio del tanque
    float alturatq; //altura del tanque
    float v_agua; //velocidad del agua
    
    float voltq;
    float caudal;

    public Variables(float radiotub, float radiotq, float alturatq, float v_agua, float voltq, float caudal) {
        this.radiotub = radiotub;
        this.radiotq = radiotq;
        this.alturatq = alturatq;
        this.v_agua = v_agua;
        this.voltq = voltq;
        this.caudal = caudal;
    }

    public float getRadiotub() {
        return radiotub;
    }

    public void setRadiotub(float radiotub) {
        this.radiotub = radiotub;
    }

    public float getRadiotq() {
        return radiotq;
    }

    public void setRadiotq(float radiotq) {
        this.radiotq = radiotq;
    }

    public float getAlturatq() {
        return alturatq;
    }

    public void setAlturatq(float alturatq) {
        this.alturatq = alturatq;
    }

    public float getV_agua() {
        return v_agua;
    }

    public void setV_agua(float v_agua) {
        this.v_agua = v_agua;
    }

    public float getVoltq() {
        return voltq;
    }

    public void setVoltq(float voltq) {
        this.voltq = voltq;
    }

    public float getCaudal() {
        return caudal;
    }

    public void setCaudal(float caudal) {
        this.caudal = caudal;
    }
    
    
}
