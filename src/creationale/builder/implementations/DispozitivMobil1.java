package creationale.builder.implementations;

public class DispozitivMobil1 {
    private String fabricant;
    private String model;
    private int gbRAM;
    // Interfete care descriu o anumita componenta
    private Object interfata1;
    private Object interfata2;
    private Object interfata3;

    private DispozitivMobil1() {
    }

    public String getFabricant() {
        return fabricant;
    }

    public String getModel() {
        return model;
    }

    public int getGbRAM() {
        return gbRAM;
    }

    public Object getInterfata1() {
        return interfata1;
    }

    public Object getInterfata2() {
        return interfata2;
    }

    public Object getInterfata3() {
        return interfata3;
    }

    public static class DispozitivMobilBuilder {
        private DispozitivMobil1 dispozitivMobil1;

        public DispozitivMobilBuilder() {
            this.dispozitivMobil1 = new DispozitivMobil1();
        }

        public DispozitivMobilBuilder withRAM(int ram){
            this.dispozitivMobil1.gbRAM = ram;
            return this;
        }
        public DispozitivMobilBuilder withFabricant(String fabricant){
            this.dispozitivMobil1.fabricant = fabricant;
            return this;
        }
        public DispozitivMobilBuilder withModel(String model){
            this.dispozitivMobil1.model = model;
            return this;
        }
        public DispozitivMobilBuilder withInterfata1(Object interfata1){
            this.dispozitivMobil1.interfata1 = interfata1;
            return this;
        }
        public DispozitivMobilBuilder withInterfata2(Object interfata2){
            this.dispozitivMobil1.interfata2 = interfata2;
            return this;
        }
        public DispozitivMobilBuilder withInterfata3(Object interfata3){
            this.dispozitivMobil1.interfata3 = interfata3;
            return this;
        }
        public DispozitivMobil1 build(){
            return this.dispozitivMobil1;
        }

    }
}
