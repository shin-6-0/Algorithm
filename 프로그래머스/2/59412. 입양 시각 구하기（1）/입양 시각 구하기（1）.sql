-- 코드를 입력하세요
select 
        TO_CHAR(datetime,'HH24') hour,
        COUNT(*) COUNT
from
        animal_outs
where
        to_char(datetime, 'HH24') between 09 and 19 
group by 
        to_char(datetime, 'HH24')
order by
        hour;