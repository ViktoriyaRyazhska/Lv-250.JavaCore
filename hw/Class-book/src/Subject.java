/**
 * Created by User on 14.07.2017.
 */
public class Subject {
    private Names name;
    private int rate;

    public enum Names{
        Physics, Algebra, Geometry, Biology
    }

    public Subject(String name) throws NameSubjectExeption {
        Names n = nameToEnum(name);
        this.name = n;
    }

    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    private Names nameToEnum(String name) throws NameSubjectExeption{
        switch (name.toLowerCase()){
            case "physics":
                return Names.Physics;
            case "algebra":
                return Names.Algebra;
            case "geometry":
                return Names.Geometry;
            case "biology":
                return Names.Biology;
            default:
                throw new NameSubjectExeption("Take only subject physics, algebra, geometry or biology");
        }
    }
}
