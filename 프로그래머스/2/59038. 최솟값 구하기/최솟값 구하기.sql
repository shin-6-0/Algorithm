-- 코드를 입력하세요
SELECT
    datetime 시간
from
    (select * from animal_ins order by datetime)
where
    rownum=1;