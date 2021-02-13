pipeline{
	agent any
	tools{
		maven 'maven'
		jdk 'jdk8'
	}
	stages{
	stage('git repo & clean'){
		steps{
		sh'rm -r restassured-with-cucumber-demo-1'
		sh'git clone https://github.com/automationa2z/restassured-with-cucumber-demo.git'
		sh'mvn clean'
		}
	}
	stage('install'){
		steps{
		sh'mvn install'
		}
	}
	stage('test'){
		steps{
		sh'mvn test'
		}
	}
	stage('package'){
		steps{
		sh'mvn package'
		}
	}
	}
}
