package skamila.udpj.document.model;

import javax.persistence.*;

@Entity
public class Letter extends Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressee_id", foreignKey = @ForeignKey(name = "ADDRESSEE_ID_FK"))
    private Addressee addressee;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Addressee getAddressee() {
        return addressee;
    }

    public void setAddressee(Addressee addressee) {
        this.addressee = addressee;
    }
}
