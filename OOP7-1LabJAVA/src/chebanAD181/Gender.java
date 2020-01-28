package chebanAD181;

public class Gender {
    public String getGender(String wordEnd) {
        String gender = "null";//стандартное значение пола существительного
        //массивы значений окончаний для определение пола(числа) существительных
        String []arrEndMale = {"ик"};
        String []arrEndFemale = {"дь"};
        String []arrEndNeuter = {"но"};
        char []arrEndPlural = {'a','я','ы','и'};

        //перебор arrEndPlural[] - определение множественного знач. существительного
        for(int i = 0; i < arrEndPlural.length; i++) {
            if(wordEnd.charAt(1) == arrEndPlural[i]) {
                gender = "plural";
                return gender;
            }
        }
        //перебор arrEnd...[] - определение муж/жен/ср рода существительного
        //equals - метод сравнения строк
        for(int i = 0; i < arrEndFemale.length || i < arrEndMale.length || i < arrEndNeuter.length; i++) {
            if(wordEnd.equals(arrEndFemale[i])) {
                gender = "female";
                break;
            }
            if(wordEnd.equals(arrEndMale[i])) {
                gender = "male";
                break;
            }
            if(wordEnd.equals(arrEndNeuter[i])) {
                gender = "neuter";
                break;
            }
        }
        return gender;
    }
}
