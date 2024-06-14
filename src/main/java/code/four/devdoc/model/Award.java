package code.four.devdoc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;

@Entity
public class Award {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long awardId;

    private String awardName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resume")
    @JsonBackReference
    private Resume resume;

    public Award() {}

    public Award(String awardName, Resume resume) {
        super();
        this.awardName = awardName;
        this.resume = resume;
    }


    public long getAwardId() {
        return awardId;
    }

    public void setAwardId(long awardId) {
        this.awardId = awardId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }
}

