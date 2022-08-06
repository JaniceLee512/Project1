/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  User
 * Created: 2022/7/15
 */

DROP TABLE HOME;
DROP TABLE SCHOOL;
DROP TABLE COMPANY;

CREATE TABLE HOME(
              NAME VARCHAR(40) NOT NULL,
              PRODUCT VARCHAR(40) NOT NULL,
              PRICE INTEGER NOT NULL,
              NUMBER INTEGER NOT NULL,  
              TOTAL INTEGER NOT NULL
                      );
CREATE TABLE SCHOOL(
              NAME VARCHAR(40) NOT NULL,
              PRODUCT VARCHAR(40) NOT NULL,
              PRICE INTEGER NOT NULL,
              NUMBER INTEGER NOT NULL,  
              TOTAL INTEGER NOT NULL
                      );
CREATE TABLE COMPANY(

              NAME VARCHAR(40) NOT NULL,
              PRODUCT VARCHAR(40) NOT NULL,
              PRICE INTEGER NOT NULL,
              NUMBER INTEGER NOT NULL,  
              TOTAL INTEGER NOT NULL
                      );

INSERT INTO HOME VALUES('Janice','牛奶',88,2,176);
INSERT INTO HOME VALUES('Jason','可樂',29,3,87);
INSERT INTO HOME VALUES('Amy','雞肉',29,3,87);

INSERT INTO SCHOOL VALUES('Jason','國文課本',88,3,264);
INSERT INTO SCHOOL VALUES('Janice','數學課本',88,4,352);
INSERT INTO SCHOOL VALUES('Jessie','英文課本',88,5,440);
INSERT INTO SCHOOL VALUES('Max','鉛筆',29,3,87);

INSERT INTO COMPANY VALUES('Robin','影印紙',29,3,87);
INSERT INTO COMPANY VALUES('Janice','墨水',200,1,200);
INSERT INTO COMPANY VALUES('Jessie','訂書針',29,3,87);