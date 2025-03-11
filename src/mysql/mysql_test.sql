USE 신세계무역;
SHOW TABLES;

#01
-- 2

#02
-- 1

#03
-- 1

#04
-- 2

#05
-- 1

#06
-- 1

#13
-- 3

#14
-- 4

#15
-- 1

#16
-- 3

#17
SELECT * FROM 제품 WHERE 제품명 LIKE '%주스';

#18
SELECT * FROM 제품 WHERE 제품명 LIKE '%주스' AND 단가 BETWEEN 5000 AND 10000;

#19
SELECT * FROM 제품 WHERE 제품번호 IN(1, 2, 4, 7, 11, 20);

#20
SELECT 제품번호, 제품명, 단가, 재고, (단가*재고) AS 재고금액 FROM 제품 ORDER BY 재고금액 DESC LIMIT 10;

#21
-- 1

#22
-- 4

#23
-- 1

#24
-- 3

#25
-- 1

#26
-- 4

#27
SELECT 담당자명 FROM 고객 WHERE 담당자명 LIKE '%정%';

#28
SELECT * FROM 주문 WHERE MONTH(주문일) IN(4, 5, 6);

#29
SELECT 제품번호, 제품명, 재고, if(재고>=100, '과다재고', if(재고>=10, '적정', '재고부족')) AS 재고구분
FROM 제품;

#30
SELECT * FROM 사원;
SELECT 이름, 부서번호, 직위, 입사일, DATEDIFF(NOW(), 입사일) FROM 사원;

#31
-- 4

#32
-- 1

#33
-- 4

#34
-- 4

#35
-- 2

#36
SELECT 제품번호, SUM(주문수량) AS 주문수량합, SUM(단가*주문수량) AS 주문금액합
FROM 주문세부
GROUP BY 제품번호;

#37
SELECT 주문번호, 제품번호, SUM(단가*주문수량) AS 주문금액합
FROM 주문세부
GROUP BY 주문번호, 제품번호;

#38
SELECT 고객번호, COUNT(주문번호) AS 주문건수
FROM 주문
WHERE YEAR(주문일) = 2021
GROUP BY 고객번호
ORDER BY 주문건수 DESC
LIMIT 3;

#39
SELECT 직위, COUNT(사원번호) AS 사원수, 이름
FROM 사원
GROUP BY 직위, 이름;

#40
-- 2

#41
-- 2

#42
-- 3

#43
-- 3

#44
-- 4

#45 XX


#46
SELECT c.*
FROM 고객 c
JOIN 주문 o ON(c.고객번호 = o.고객번호)
WHERE o.주문번호 = 'H0249';

#47
SELECT c.*
FROM 고객 c
JOIN 주문 o ON(c.고객번호 = o.고객번호)
WHERE o.주문일 = '2020-04-09';

#48
SELECT c.도시, SUM(d.단가*d.주문수량) AS 주문금액합
FROM 고객 c
JOIN 주문 o ON(c.고객번호 = o.고객번호)
JOIN 주문세부 d ON(o.주문번호 = d.주문번호)
GROUP BY c.도시
ORDER BY 주문금액합 DESC
LIMIT 5;

#49
-- 1,4

#50
-- 2

#51
-- 4

#52
SELECT 제품명 FROM 제품 WHERE 단가 = (SELECT MAX(단가) FROM 제품);

#53
SELECT p.제품명, SUM(d.주문수량) AS 주문수량합
FROM 제품 p
JOIN 주문세부 d ON(p.제품번호 = d.제품번호)
WHERE p.단가 = (SELECT MAX(단가) FROM 제품)
GROUP BY p.제품명 ;

#54
SELECT SUM(주문수량)
FROM 주문세부
WHERE 제품번호 IN (SELECT 제품번호 FROM 제품 WHERE 제품명 LIKE '%아이스크림%');

#55
SELECT YEAR(주문일) AS 주문년도, COUNT(주문번호) AS 주문건수
FROM 주문
WHERE 고객번호 IN(SELECT 고객번호 FROM 고객 WHERE 도시 = '서울특별시')
GROUP BY YEAR(주문일);

#56
-- 3

#57
-- 4

#58
-- 2

#59
-- 1

#60
-- 1

#61
INSERT INTO 고객 (고객번호, 담당자명, 고객회사명, 도시) VALUES
                                           ('ZZZAA', '한동욱', '자유트레이딩', '서울특별시');

#62
UPDATE 고객 SET 도시 = '부산광역시', 마일리지 = 100, 담당자직위 = '대표 이사' WHERE 고객번호 = 'ZZZAA';


#63
UPDATE 고객 SET 마일리지 = 11648.1 WHERE 고객번호 = 'ZZZAA';
SELECT AVG(마일리지) FROM 고객 WHERE 담당자직위 = '대표 이사';

#64
INSERT INTO 사원(사원번호, 이름, 직위) VALUES ('E15', '이석진', '수습사원')
ON DUPLICATE KEY UPDATE 사원번호 = 'E15';

#65
DELETE FROM 고객 WHERE 고객번호 = 'ZZZAA';

#66
DELETE FROM 사원 WHERE 사원번호 = 'E15';

#67
-- 1: ㄱ
-- 2: ㄹ
-- 3: ㄴ
-- 4: ㄴ
-- 5: ㄴ
-- 6: ㄴ
-- 7: ㅅ
-- 8: ㅂ
-- 9: ㄴ
-- 10: ㅂ
-- 11: ㄴ
-- 12: ㄷ

#68
-- 4

#69
-- 4

#70
-- 1

#71 XX
CREATE TABLE 영화 (
    영화번호 CHAR(5) PRIMARY KEY ,
    타이틀 VARCHAR(100) NOT NULL ,
    장르 VARCHAR(20)
        CHECK (장르 IN('코미디', '드라마', '다큐', 'SF', '액션', '역사', '기타')) ,
    배우 VARCHAR(100) NOT NULL ,
    감독 VARCHAR(50) NOT NULL ,
    제작사 VARCHAR(50) NOT NULL ,
    개봉일 DATE ,
    등록일 DATE DEFAULT CURRENT_DATE
);

#72 XX
CREATE TABLE 평점관리 (
    번호 INT AUTO_INCREMENT,
    평가자닉네임 VARCHAR(50) NOT NULL ,
    영화번호 CHAR(5) NOT NULL ,
    평점 INT NOT NULL CHECK ( 평점 BETWEEN 1 AND 5),
    평가 VARCHAR(2000) NOT NULL ,
    등록일 DATE DEFAULT CURRENT_DATE
);

#73
-- 3

#74
-- 1

#75
-- 4

#76
-- 1

#77
CREATE VIEW view_상위3고객 AS
SELECT c.고객번호, c.고객회사명, c.담당자명, SUM(d.단가*d.주문수량) AS 주문금액합
FROM 고객 c
JOIN 주문 o ON(c.고객번호 = o.고객번호)
JOIN 주문세부 d ON(o.주문번호 = d.주문번호)
GROUP BY c.고객번호, c.고객회사명, c.담당자명
ORDER BY 주문금액합 DESC
LIMIT 3;

#78
CREATE VIEW view_제품명별주문요약 AS
    SELECT p.제품명, SUM(d.주문수량) AS 주문수량합, SUM(d.단가*d.주문수량) AS 주문금액합
    FROM 제품 p
    JOIN 주문세부 d ON(p.제품번호 = d.제품번호)
    GROUP BY 제품명 ;

#79
SELECT * FROM view_제품명별주문요약 WHERE 주문수량합 >= 1000;

#80
CREATE VIEW view_광역시고객 AS
    SELECT 고객번호, 고객회사명, 담당자명, 도시
    FROM 고객
    WHERE 도시 LIKE '%광역시%';

#81
-- 3

#82
-- 2

#83
-- 1

#84
-- 1

#85
-- 2

#86 XX
DROP PROCEDURE IF EXISTS CUSTOMER_PROCEDURE;

DELIMITER $$
CREATE PROCEDURE CUSTOMER_PROCEDURE (IN p_담당자명 VARCHAR(20))
BEGIN
    SELECT c.고객회사명, COUNT(o.주문번호) AS 주문건수, SUM(d.단가*d.주문수량) AS 주문금액합
    FROM 고객 c
    JOIN 주문 o ON(c.고객번호 = o.고객번호)
    JOIN 주문세부 d ON(o.주문번호 = d.주문번호)
    WHERE c.담당자명 = p_담당자명
    GROUP BY c.담당자명, c.고객회사명;
end $$
DELIMITER ;

CALL CUSTOMER_PROCEDURE('박은빈');

#87
DROP PROCEDURE IF EXISTS ORDER_PROCEDURE;

DELIMITER $$
CREATE PROCEDURE ORDER_PROCEDURE (IN START_DATE DATE, IN END_DATE DATE)
BEGIN
    SELECT p.제품명, SUM(d.단가*d.주문수량) AS 주문금액합
    FROM 제품 p
    JOIN 주문세부 d ON(p.제품번호 = d.제품번호)
    JOIN 주문 o ON(d.주문번호 = o.주문번호)
    WHERE o.주문일 BETWEEN START_DATE AND END_DATE
    GROUP BY p.제품명
    ORDER BY 주문금액합 DESC
    LIMIT 10;
end $$
DELIMITER ;

CALL ORDER_PROCEDURE('2020-03-12', '2020-03-17');

#88 XX
# DELIMITER $$
# CREATE FUNCTION BIRTHDAY_FUNCTION (IN BIRTH_DATE DATE)
#     RETURNS VARCHAR(20)
# BEGIN
#
# end $$

#89 XX

#90
-- 3

