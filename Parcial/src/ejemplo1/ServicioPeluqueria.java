package ejemplo1;
public enum ServicioPeluqueria {
    FADEHAIRCUT("BOB","It is a cut at jaw or shoulder height, which can be straight, round, layered or tapered.",12000) {
        @Override
        public String ShowUse() {
            return null;
        }
    },NAILS("acrylic","They are rigid but malleable extensions that are applied to natural nails.",30000) {
        @Override
        public String ShowUse() {return null;}},
    DYE("Black","es una de las alternativas que existen para cambiar de imagen, darle un sello especial a tu personalidad o mantener tu apariencia al cubrir tus canas.",15000){
        @Override
        public String ShowUse() {return null;}
    };
    private String name;
    private String description;
    private Integer cost;

    ServicioPeluqueria(String name, String description, Integer cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public String getNombre(){return name;}
    public String getDescripcion(){return description;}
    public int getCost(){return cost;}
    public abstract String ShowUse();
}

