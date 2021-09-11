package itneo;

public enum TypyPromocji {

    STANDARDOWE(6, "Promocja standardowa"),
    PREMIUM(10, "Promocja premium"),
    SUPERB(15, "Promocja super plus B"),
    NOWA_EXTRA_PROMOCJA(70, "Promocja nowa ekstra GOLD.");

    private final int stawka;
    private final String opis;

    TypyPromocji(int stawka, String opis) {

        this.stawka = stawka;
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public int getStawka() {
        return stawka;
    }


}
