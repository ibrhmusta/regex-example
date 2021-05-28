package regex.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="demos")
public class DemoEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;

@Pattern(regexp="^(05)([0-9]{2})\\s?([0-9]{3})\\s?([0-9]{2})\\s?([0-9]{2})$",message = "Telefon numarası format hatası")
@Column(name="phone_number")
private String phoneNumber;

@Pattern(regexp="^[1-9]{1}[0-9]{9}[02468]{1}$",message="TC No format hatası")
@Column(name="identity_number")
private String identityNumber;

@Pattern(regexp="^[0-9]{10}$",message="Vergi No format hatası")
@Column(name="tax_number")
private String taxumber;

@Pattern(regexp="^([0-9]{4})\\s?([0-9]{4})\\s?([0-9]{4})\\s?([0-9]{4})$",message="Kredi kartı No format hatası")
@Column(name="credit_cart_no")
private String creditCartNo;

@Pattern(regexp="^(0[1-9]|[1-7][0-9]|8[01])(([A-Z])(\\d{4,5})|([A-Z]{2})(\\d{3,4})|([A-Z]{3})(\\d{2,3}))$",message = "Plaka format hatası")
@Column(name="plate")
private String plate;


}

















