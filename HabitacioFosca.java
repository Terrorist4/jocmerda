public class HabitacioFosca extends Habitacio {
    private boolean illuminada = false;

    public HabitacioFosca(String nom, String descripcio){
        super(nom, descripcio);
    }

    // TO DO: canviar per utilitzarItem() *ja esta <3*


    public String utilitzarItem(Item item){

        String objecte = item.getNom();

        if (objecte.equals("Llanterna")){
            System.out.println("Encens la llanterna i il.lumines l'habitació. \n" +
                                "Veus una estrella al centre de l'habitació.");
            illuminada= true;


            return super.toString();

        } else {
            return "---" + "---\n" +
                    "No veus res. Necessites una llanterna!\n" +
                    "Sortides visibles: cap";
        }
    }

    @Override
    public String toString() {
        if (!illuminada) {
            return "L'habitació és a les fosques, no es veu res. \n"+ "Torna per on has vingut.";
        }
        else {
            return super.toString();
        }
    }

    @Override
    public Item getItem(){
        if (!illuminada) {
            return null;
        }
        else {
            return super.getItem();
        }
    }
}
