package com.application.gym.dto;

import com.application.gym.entity.Trainer;
import com.application.gym.entity.User;
import jakarta.validation.constraints.*;

import java.util.List;

public class TrainerDto {
    private Long trainerId;
    @Email(message = "not an proper email id")
    private String email;
    @NotNull(message = "password is null")
    @NotEmpty(message = "password is empty")
    private String password;
    private String name;
    private String trainerType; // weight training or Weight Loss or Zumba
    //private List<User> trainee;
    private Long mobileNo;
    @Min(value = 0,message = "marks less than min value")
    @Max(value = 100,  message = "marks greater than max value")
    private int marks;
    private List<User> trainee;

    public Long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Long trainerId) {
        this.trainerId = trainerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainerType() {
        return trainerType;
    }

    public void setTrainerType(String trainerType) {
        this.trainerType = trainerType;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public List<User> getTrainee() {
        return trainee;
    }

    public void setTrainee(List<User> trainee) {
        this.trainee = trainee;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static Trainer prepareTrainer(TrainerDto trainerDto) {
        Trainer trainer = new Trainer();
        trainer.setName(trainerDto.getName());
        trainer.setEmail(trainerDto.getEmail());
        trainer.setTrainerType(trainerDto.getTrainerType());
        trainer.setPassword(trainerDto.getPassword());
        trainer.setMobileNo(trainerDto.getMobileNo());
        trainer.setTrainerId(trainerDto.getTrainerId());
        trainer.setTrainee(trainerDto.getTrainee());
        return trainer;
    }
}
