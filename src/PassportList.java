import java.util.Set;

public class PassportList {
    private Set<Passport> passports;

    public PassportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public void add(Passport passport) {
        passports.add(passport);
    }

    public Passport get(String number)
    {
        for(Passport passport: passports){
            if(passport.getNumber().equals(number)){
                return passport;
            }
        }
        return null;
    }

}
