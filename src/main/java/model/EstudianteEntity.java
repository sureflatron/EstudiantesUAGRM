package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "estudiante", schema = "uagrm")
public class EstudianteEntity {
    private int id;
    private String carrera;
    private int registro;
    private String nombres;
    private String ci;
    private String nacimiento;
    private String sexo;
    private String estadoCivil;
    private String paísN;
    private String dptoN;
    private String provinciaN;
    private String país;
    private String sangre;
    private String seguro;
    private String dirección;
    private String teléfono;
    private Integer celular;
    private String casilla;
    private String mail;
    private Integer nroTitulo;
    private Integer yearTitulo;
    private String emisionTitulo;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Carrera")
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Basic
    @Column(name = "Registro")
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    @Basic
    @Column(name = "Nombres")
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "Ci")
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Basic
    @Column(name = "nacimiento")
    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Basic
    @Column(name = "Sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "Estado_civil")
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Basic
    @Column(name = "PaísN")
    public String getPaísN() {
        return paísN;
    }

    public void setPaísN(String paísN) {
        this.paísN = paísN;
    }

    @Basic
    @Column(name = "DptoN")
    public String getDptoN() {
        return dptoN;
    }

    public void setDptoN(String dptoN) {
        this.dptoN = dptoN;
    }

    @Basic
    @Column(name = "ProvinciaN")
    public String getProvinciaN() {
        return provinciaN;
    }

    public void setProvinciaN(String provinciaN) {
        this.provinciaN = provinciaN;
    }

    @Basic
    @Column(name = "País")
    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    @Basic
    @Column(name = "sangre")
    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    @Basic
    @Column(name = "seguro")
    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    @Basic
    @Column(name = "Dirección")
    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    @Basic
    @Column(name = "Teléfono")
    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    @Basic
    @Column(name = "celular")
    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "Casilla")
    public String getCasilla() {
        return casilla;
    }

    public void setCasilla(String casilla) {
        this.casilla = casilla;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "NroTitulo")
    public Integer getNroTitulo() {
        return nroTitulo;
    }

    public void setNroTitulo(Integer nroTitulo) {
        this.nroTitulo = nroTitulo;
    }

    @Basic
    @Column(name = "YearTitulo")
    public Integer getYearTitulo() {
        return yearTitulo;
    }

    public void setYearTitulo(Integer yearTitulo) {
        this.yearTitulo = yearTitulo;
    }

    @Basic
    @Column(name = "emisionTitulo")
    public String getEmisionTitulo() {
        return emisionTitulo;
    }

    public void setEmisionTitulo(String emisionTitulo) {
        this.emisionTitulo = emisionTitulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstudianteEntity that = (EstudianteEntity) o;
        return id == that.id &&
                registro == that.registro &&
                ci == that.ci &&
                Objects.equals(carrera, that.carrera) &&
                Objects.equals(nombres, that.nombres) &&
                Objects.equals(nacimiento, that.nacimiento) &&
                Objects.equals(sexo, that.sexo) &&
                Objects.equals(estadoCivil, that.estadoCivil) &&
                Objects.equals(paísN, that.paísN) &&
                Objects.equals(dptoN, that.dptoN) &&
                Objects.equals(provinciaN, that.provinciaN) &&
                Objects.equals(país, that.país) &&
                Objects.equals(sangre, that.sangre) &&
                Objects.equals(seguro, that.seguro) &&
                Objects.equals(dirección, that.dirección) &&
                Objects.equals(teléfono, that.teléfono) &&
                Objects.equals(celular, that.celular) &&
                Objects.equals(casilla, that.casilla) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(nroTitulo, that.nroTitulo) &&
                Objects.equals(yearTitulo, that.yearTitulo) &&
                Objects.equals(emisionTitulo, that.emisionTitulo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, carrera, registro, nombres, ci, nacimiento, sexo, estadoCivil, paísN, dptoN, provinciaN, país, sangre, seguro, dirección, teléfono, celular, casilla, mail, nroTitulo, yearTitulo, emisionTitulo);
    }
}
