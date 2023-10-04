package com.wooin.hahahaback.quizreaction.entity;

import com.wooin.hahahaback.quiz.entity.Quiz;
import jakarta.persistence.*;

@Entity
public class QuizScore {

    ////컬럼 - 연관관계 컬럼을 제외한 컬럼을 정의합니다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long viewCount; //조회수
    private Long solvedCount; //맞춘 수
    private Long wrongCount; //틀린 수

    //문제에 대한 평가 (A: 가장 높음 ~ )
    private Long scoreA;
    private Long scoreB;
    private Long scoreC;


    ////생성자 - 약속된 형태로만 생성가능하도록 합니다.



    ////연관관계 - Foreign Key 값을 따로 컬럼으로 정의하지 않고 연관 관계로 정의합니다.

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz;


    ////연관관계 편의 메소드 - 반대쪽에는 연관관계 편의 메소드가 없도록 주의합니다.



    //// 서비스 메소드 - 외부에서 엔티티를 수정할 메소드를 정의합니다. (단일 책임을 가지도록 주의합니다.)
}
