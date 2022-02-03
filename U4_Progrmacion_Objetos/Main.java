public class Main {
    public static void main(String[] args) {
        Opositor o1 = new Opositor("mario","cantero shimizu",2002,false,"aaaaaaa");
        Opositor o2 = new Opositor("alfonso","lopez diaz",2001,true,"No tiene manos");

        Opositor o3 = new Opositor("maria","cantero shimizu",2002,false,"ooooooo");
        Opositor o4 = new Opositor("alfonsa","lopez diaz",2001,true,"No tiene pies");


        Sedes sevilla = new Sedes("siuuuu",Ciudades_capitales.SEVILLA);
        Sedes cadiz = new Sedes("recontracagarAPalos",Ciudades_capitales.CADIZ);

        Opcion pregunta1 = new Opcion("siuuuu",false);
        Opcion pregunta2 = new Opcion("siuuuu",false);
        Opcion pregunta3 = new Opcion("aaaaaa",false);

        Opcion pregunta4 = new Opcion("siuuuu",true);
        Opcion pregunta5 = new Opcion("nooooo",false);
        Opcion pregunta6 = new Opcion("noooos",true);

        Preguntas cuestionario = new Preguntas("¿ Que dice el bicho ? ");
        Preguntas cuestionario2 = new Preguntas("¿ Que dice el bicho 2? ");

        Examen examen1 = new Examen(sevilla,"sioque");


        cuestionario.add_opcion(pregunta1);
        cuestionario.add_opcion(pregunta2);
        cuestionario.add_opcion(pregunta3);
        cuestionario.delete_opcion(pregunta1);

        cuestionario2.add_opcion(pregunta4);
        cuestionario2.add_opcion(pregunta5);
        cuestionario2.add_opcion(pregunta6);
        cuestionario2.delete_opcion(pregunta4);


        sevilla.add_opositor(o1);
        sevilla.add_opositor(o3);
        sevilla.delete_opositor(o1);

        cadiz.add_opositor(o2);
        sevilla.add_opositor(o4);
        cadiz.delete_opositor(o2);

        examen1.add_pregunta(cuestionario);
        examen1.add_pregunta(cuestionario2);
        examen1.delete_pregunta(cuestionario);








    }
}
