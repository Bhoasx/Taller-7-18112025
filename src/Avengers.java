public class Avengers implements Comparable<Avengers>{
    private String ID;
    private String Nombre;
    private String MisionAsignada;
    private int NivelPeligro;
    private int PagoMensual;
    private double AporteMensual = PagoMensual * 0.08;
    private double ImpuestoGobierno;

    public Avengers(String ID, String nombre, int pagoMensual/*, int peso, String ciudadRecep, String cedulaRecep, String ciudadEnte*/) {
        this.ID = ID;
        Nombre = nombre;
        PagoMensual = pagoMensual;
        /*this.peso = peso;
        this.ciudadRecep = ciudadRecep;
        this.cedulaRecep = cedulaRecep;                 //con estos el programa no corre, se me ocurre hacer otra
        this.ciudadEnte = ciudadEnte;*/                 //capa de negocio con estos porque los necesito
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMisionAsignada() {
        return MisionAsignada;
    }
    public void setMisionAsignada(String misionAsignada) {
        MisionAsignada = misionAsignada;
    }

    public int getNivelPeligro() {
        return NivelPeligro;
    }
    public void setNivelPeligro(int nivelPeligro) {
        NivelPeligro = nivelPeligro;
    }

    public int getPagoMensual() {
        return PagoMensual;
    }
    public void setPagoMensual(int pagoMensual) {
        PagoMensual = pagoMensual;
    }

    public double getAporteMensual() {
        return AporteMensual;
    }
    public void setAporteMensual(double aporteMensual) {
        AporteMensual = aporteMensual;
    }

    public double getImpuestoGobierno() {
        return ImpuestoGobierno;
    }
    public void setImpuestoGobierno(double impuestoGobierno) {
        ImpuestoGobierno = impuestoGobierno;
    }

    @Override
    public String toString() {
        return "Avengers:  "         +          "\n"         +
                "Nombre= "           + Nombre  +  "\n"       +
                " MisionAsignada= "  + MisionAsignada + "\n" +
                " NivelPeligro= "    + NivelPeligro + "\n"   +
                " PagoMensual="      + PagoMensual +"\n"     +
                " AporteMensual="    + AporteMensual + "\n"  +
                " ImpuestoGobierno=" + ImpuestoGobierno      ;

        /*if (PagoMensual * 12 <= 50000){
            ImpuestoGobierno = PagoMensual;
        } else if (PagoMensual * 12 > 50000 || PagoMensual * 12 <= 100000){
            ImpuestoGobierno = (PagoMensual - 5000) * 0.1;
        } else if (PagoMensual * 12 > 100000|| PagoMensual * 12 <= 200000){     //este prb tmb este mal pero nidea
            ImpuestoGobierno = (PagoMensual - 10000) * 0.2;
        } else if (PagoMensual * 12 > 200000){
            ImpuestoGobierno = (PagoMensual - 20000) * 0.3;
        }*/
    }

    @Override
    public int compareTo(Avengers o) {
        return Double.compare(this.AporteMensual , o.AporteMensual);
    }

    public double Impuesto(){
        double impuesto = ImpuestoGobierno;
        if (PagoMensual * 12 <= 50000){
            ImpuestoGobierno = 0;
        } else if (PagoMensual * 12 > 50000 || PagoMensual * 12 <= 100000){
            impuesto = (PagoMensual - 5000) * 0.1;
        } else if (PagoMensual * 12 > 100000|| PagoMensual * 12 <= 200000){         //prob este mal pero como no corro
                                                                                    //el programa no lose
            impuesto = (PagoMensual - 10000) * 0.2;
        } else if (PagoMensual * 12 > 200000){
            impuesto = (PagoMensual - 20000) * 0.3;
        }
        return PagoMensual * impuesto;
    }
}