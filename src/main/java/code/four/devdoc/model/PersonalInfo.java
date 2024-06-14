package code.four.devdoc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;

@Entity
public class PersonalInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long personalInfoId;

    private String Name;
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resume")
    @JsonBackReference
    private Resume resume;

    public PersonalInfo() {}

    public PersonalInfo(String Name, String phoneNumber, Resume resume) {
        super();
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.resume = resume;
    }

    // Getter and Setter methods
    public long getPersonalInfoId() {
        return personalInfoId;
    }

    public void setPersonalInfoId(long personalInfoId) {
        this.personalInfoId = personalInfoId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }
}
