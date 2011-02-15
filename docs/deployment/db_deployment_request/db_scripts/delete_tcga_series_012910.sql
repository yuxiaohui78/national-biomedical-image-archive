#MAKE SURE YOU DONT LEAVE A DANGLING STUDY!!!


create temporary table series_temp as 
select general_series_pk_id 
  from general_series 
  where series_instance_uid in 
('1.3.6.1.4.1.9328.50.46.172011122759953262210726156409282939622',
'1.3.6.1.4.1.9328.50.46.322877462545804029094385251954179193943',
'1.3.6.1.4.1.9328.50.46.271915444823147641148601703478615652417',
'1.3.6.1.4.1.9328.50.46.265864897522912185828505945866355860404',
'1.3.6.1.4.1.9328.50.46.269513514793589766834370525124367831212',
'1.3.6.1.4.1.9328.50.46.271249169797975328166958050092580296624',
'1.3.6.1.4.1.9328.50.46.330302796540364718338654636566618559081',
'1.3.6.1.4.1.9328.50.46.273831771188900752942059406413028695809',
'1.3.6.1.4.1.9328.50.46.88770539916291846945269349067243680452',
'1.3.6.1.4.1.9328.50.46.47927289645772238622185864914587659911',
'1.3.6.1.4.1.9328.50.46.91723994793766372385600886322866313007',
'1.3.6.1.4.1.9328.50.46.996485926064146265998131734348355728',
'1.3.6.1.4.1.9328.50.46.5877615103635157284093570441618545744',
'1.3.6.1.4.1.9328.50.46.16561799161675636468344981101422369264',
'1.3.6.1.4.1.9328.50.46.162033283912475971986892500987426152682',
'1.3.6.1.4.1.9328.50.46.190097378519043157969012524436698665464',
'1.3.6.1.4.1.9328.50.46.317721458008718635382524266861169117393',
'1.3.6.1.4.1.9328.50.46.322578304868568106062892830708365641811',
'1.3.6.1.4.1.9328.50.46.93497263237863729554719279429930401043'
);


create temporary table image_temp as 
  select image_pk_id from general_image where general_series_pk_id in (select * from series_temp);

delete c
from ct_image c, image_temp i
where c.image_pk_id = i.image_pk_id;

delete q
from qa_status_history q, image_temp i
where q.general_image_pk_id = i.image_pk_id;

delete gi
from general_image gi, series_temp st
where gi.general_series_pk_id = st.general_series_pk_id;

delete a
from annotation a, series_temp si
where a.general_series_pk_id =si.general_series_pk_id;

delete gs
from general_series gs, series_temp si
where gs.general_series_pk_id = si.general_series_pk_id;


drop table series_temp;
drop table image_temp;