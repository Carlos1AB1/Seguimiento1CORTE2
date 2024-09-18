package TiposPrimitivosYWrappers;

public class TiposPrimitivosYWrappers {
    public static void main(String[] args) {

        byte tipoByte = 10;
        short tipoShort = 100;
        int tipoInt = 1000;
        long tipoLong = 10000L;
        float tipoFloat = 10.5f;
        double tipoDouble = 100.55;
        char tipoChar = 'A';
        boolean tipoBoolean = true;

        Byte wrapperByte = Byte.valueOf(tipoByte);
        Short wrapperShort = Short.valueOf(tipoShort);
        Integer wrapperInt = Integer.valueOf(tipoInt);
        Long wrapperLong = Long.valueOf(tipoLong);
        Float wrapperFloat = Float.valueOf(tipoFloat);
        Double wrapperDouble = Double.valueOf(tipoDouble);
        Character wrapperChar = Character.valueOf(tipoChar);
        Boolean wrapperBoolean = Boolean.valueOf(tipoBoolean);


        System.out.println("Tipos Primitivos y sus Wrappers:");
        System.out.println("--------------------------------");
        System.out.println("byte primitivo: " + tipoByte + " -> Byte wrapper: " + wrapperByte);
        System.out.println("short primitivo: " + tipoShort + " -> Short wrapper: " + wrapperShort);
        System.out.println("int primitivo: " + tipoInt + " -> Integer wrapper: " + wrapperInt);
        System.out.println("long primitivo: " + tipoLong + " -> Long wrapper: " + wrapperLong);
        System.out.println("float primitivo: " + tipoFloat + " -> Float wrapper: " + wrapperFloat);
        System.out.println("double primitivo: " + tipoDouble + " -> Double wrapper: " + wrapperDouble);
        System.out.println("char primitivo: " + tipoChar + " -> Character wrapper: " + wrapperChar);
        System.out.println("boolean primitivo: " + tipoBoolean + " -> Boolean wrapper: " + wrapperBoolean);
    }
}
