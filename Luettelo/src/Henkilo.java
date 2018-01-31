public class Henkilo {

    private String etunimi;
    private String sukunimi;
    private String syntymapaiva;
    private String paikkakunta;

    public Henkilo(String etunimi, String sukunimi, String syntymapaiva, String paikkakunta){
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.syntymapaiva = syntymapaiva;
        this.paikkakunta = paikkakunta;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getSyntymapaiva() {
        return syntymapaiva;
    }

    public void setSyntymapaiva(String syntymapaiva) {
        this.syntymapaiva = syntymapaiva;
    }

    public String getPaikkakunta() {
        return paikkakunta;
    }

    public void setPaikkakunta(String paikkakunta) {
        this.paikkakunta = paikkakunta;
    }


    @Override
    public String toString() {
        return etunimi + ' ' + sukunimi + '\t' + syntymapaiva + "\t" + paikkakunta;
    }
}
