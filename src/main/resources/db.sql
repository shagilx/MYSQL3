CREATE DATABASE IF NOT EXISTS  'app';
USE 'app';
DROP TABLE IF EXISTS 'skills_table';
CREATE TABLE 'skills_table'(
'skilltext' VARCHAR (20) PRIMARY  KEY NOT NULL);

DROP TABLE IF EXISTS 'levels_table';
CREATE TABLE 'levels_table'(
  'leveltext' VARCHAR(20) PRIMARY KEY NOT NULL
);

DROP TABLE IF EXISTS 'questions_table';
CREATE TABLE 'questions_table'(
  'qid' int (5) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  'text' VARCHAR(300) NOT NULL ,
  'level_text' VARCHAR(5) NOT NULL ,
  'skill_text' VARCHAR(20) NOT NULL ,
  FOREIGN KEY ('skill_text') REFERENCES 'skills_table'('skilltext') ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY ('level_text') REFERENCES 'levels_table'('leveltext') ON DELETE CASCADE ON UPDATE CASCADE
);