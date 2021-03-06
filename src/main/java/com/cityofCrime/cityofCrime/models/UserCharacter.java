package com.cityofCrime.cityofCrime.models;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class UserCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int type; //selection which person
    int money;
    int experience;
    int stamina;
    int respect;
    int intelligence;
    int strength;
    int tolerance;
    int charisma;
    int power;
    int equipment;

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    List<Equipments> equipments;

    @OneToOne
    @Cascade(CascadeType.ALL)
    Crew crew;

//    Date robDate;
//    int robType;

    int credit;

    public UserCharacter() {
        super();
    }

    public UserCharacter(int type, int money, int experience, int stamina, int respect, int intelligence, int strength, int tolerance, int charisma, int power, List<Equipments> equipments, int equipment,Crew crew, int credit) {
        this.type = type;
        this.money = money;
        this.experience = experience;
        this.stamina = stamina;
        this.respect = respect;
        this.intelligence = intelligence;
        this.strength = strength;
        this.tolerance = tolerance;
        this.charisma = charisma;
        this.power = power;
        this.equipments = equipments;
        this.equipment = equipment;
        this.crew = crew;
        this.credit = credit;
    }


    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public int getId() {
        return id;
    }

    public int getEquipment() {
        return equipment;
    }

    public void setEquipment(int equipment) {
        this.equipment = equipment;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getRespect() {
        return respect;
    }

    public void setRespect(int respect) {
        this.respect = respect;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getTolerance() {
        return tolerance;
    }

    public void setTolerance(int tolerance) {
        this.tolerance = tolerance;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<Equipments> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipments> equipments) {
        this.equipments = equipments;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
