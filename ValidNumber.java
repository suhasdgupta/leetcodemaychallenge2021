class ValidNumber {
    public boolean isNumber(String s) {
         return s.matches("(\\s*)[+-]?((\\.[0-9]+)|([0-9]+(\\.[0-9]*)?))(e[+-]?[0-9]+)?(E[+-]?[0-9]+)?(\\s*)");
    }
}
