package creationale.builder.implementations;

public class DispozitivMobil2 {
    private String fabricant;
    private String model;
    private int gbRAM;
    // Interfete care descriu o anumita componenta
    private Object interfata1;
    private Object interfata2;
    private Object interfata3;

    private DispozitivMobil2() {
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
        private String fabricant;
        private String model;
        private int gbRAM;
        // Interfete care descriu o anumita componenta
        private Object interfata1;
        private Object interfata2;
        private Object interfata3;

        public DispozitivMobilBuilder withRAM(int ram) {
            this.gbRAM = ram;
            return this;
        }

        public DispozitivMobilBuilder withFabricant(String fabricant) {
            this.fabricant = fabricant;
            return this;
        }

        public DispozitivMobilBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public DispozitivMobilBuilder withInterfata1(Object interfata1) {
            this.interfata1 = interfata1;
            return this;
        }

        public DispozitivMobilBuilder withInterfata2(Object interfata2) {
            this.interfata2 = interfata2;
            return this;
        }

        public DispozitivMobilBuilder withInterfata3(Object interfata3) {
            this.interfata3 = interfata3;
            return this;
        }

        public DispozitivMobil2 build() {
            DispozitivMobil2 dispozitivMobil2 = new DispozitivMobil2();
            dispozitivMobil2.fabricant = fabricant;
            dispozitivMobil2.model = model;
            dispozitivMobil2.gbRAM = gbRAM;
            dispozitivMobil2.interfata1 = interfata1;
            dispozitivMobil2.interfata2 = interfata2;
            dispozitivMobil2.interfata3 = interfata3;
            return dispozitivMobil2;
        }

    }
}
