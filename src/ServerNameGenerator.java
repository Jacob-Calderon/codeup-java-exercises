public class ServerNameGenerator {


        public final static int stringSize = 10;
        public String[] adjectives;
        public String[] nouns;
        public String name = new String();

        public ServerNameGenerator (){
            this.adjectives = new String []{

                "jaded", "jagged",
                "jazzy", "jealous",
                "jittery", "jobless",
                "jolly", "joyous",
                "judicious", "juicy" };

            this.nouns = new String[]{

                    "juncture",
                    "jungle",
                    "junior",
                    "junk",
                    "junta",
                    "jurisdiction",
                    "jurisprudence",
                    "jurist",
                    "juju",
                    "juke"
            };
            this.name = this.name(this.adjectives,this.nouns);
            System.out.println(this.name);

        }



    public static void main(String[] args) {
        System.out.println("Hello ServerNameGenerator");
        ServerNameGenerator hello = new ServerNameGenerator();
    }

}
