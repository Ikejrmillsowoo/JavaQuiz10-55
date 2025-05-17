package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double amountOfHours = 0.0;



    public Student() {
        this( null);
    }

    public Student(Integer id) {
        if (id != null ){
            this.id = id;
        }
    }

    public void learn(Double amountOfHours) {
        this.amountOfHours = this.amountOfHours + amountOfHours;

    }

    public Double getTotalStudyTime() {
        return this.amountOfHours;
    }
    public Integer getId() {
        return id;
    }
}
