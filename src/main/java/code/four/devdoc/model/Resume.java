package code.four.devdoc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
// @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Resume {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long resumeId;

    private String resumeTitle;

    // @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL, mappedBy="resume")
    @JsonManagedReference
    private List<PersonalInfo> personalInfos;

    // @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL, mappedBy="resume")
    private List<Award> awards;

    public Resume() {}

    public Resume(String resumeTitle) {
        super();
        this.resumeTitle = resumeTitle;
    }


    public long getResumeId() {
        return resumeId;
    }

    public void setResumeId(long resumeId) {
        this.resumeId = resumeId;
    }

    public String getResumeTitle() {
        return resumeTitle;
    }

    public void setResumeTitle(String resumeTitle) {
        this.resumeTitle = resumeTitle;
    }

    public List<PersonalInfo> getPersonalInfos() {
        return personalInfos;
    }

    public void setPersonalInfos(List<PersonalInfo> personalInfos) {
        this.personalInfos = personalInfos;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
}
