package wrapper;

public class Main {

    public static void main(String[] args) {
        
        // Primitivo
        int numeroUno = 10;
        System.out.println(numeroUno);
        
        // Wrapper Class
        Integer numeroDos = new Integer(20);
        System.out.println(numeroDos);
        System.out.println(numeroDos.toString());
        
        // Metodos de conversion
        // xxxValue() obtener el valor primitivo de un objeto
        double numeroTres = numeroDos.doubleValue();
        System.out.println(numeroTres);
        float numeroCuatro = numeroDos.floatValue();
        System.out.println(numeroCuatro);
        
        // Parseo o (parse)
        // xxx.parsexxx()
        // convertir un String a un primitivo
        String valor = "5";
        int valorEntero = Integer.parseInt(valor);
        System.out.println(valorEntero);
        double valorDouble = Double.parseDouble(valor);
        System.out.println(valorDouble);
        
        // xxx.valueOf()
        // Recibe un String y retorna un Wrapper del primitivo llamado
        Double numeroCinco = Double.valueOf(valor);
        System.out.println(numeroCinco);
        
        // Autoboxing - Auto-unboxing
        
        // Autoboxing
        // Conversion que compilador de Java de tipo primitivo a su corresponente clase wrapper
        Integer numeroAutoboxing = numeroUno;
                
        // Auto-unboxing conversion que hace el compilador de Java pasandode  una clase Wrapper a un primitivo
        int numeroUnBoxing = numeroAutoboxing;
        
        
    }
    
}
