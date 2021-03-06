/*L
   Copyright SAIC, Ellumen and RSNA (CTP)


   Distributed under the OSI-approved BSD 3-Clause License.
   See http://ncip.github.com/national-biomedical-image-archive/LICENSE.txt for details.
L*/


create table patient_temp as   
  select p.patient_pk_id 
  from study s, patient p 
  where s.patient_pk_id = p.patient_pk_id and p.trial_dp_pk_id = ***TRIAL_PROVENANCE_DATA_PK_ID***;

update patient
set visibility = '1'
where trial_dp_pk_id = ***TRIAL_PROVENANCE_DATA_PK_ID***;

update study
set visibility = '1'
where patient_pk_id in (
  select patient_pk_id 
  from patient_temp);

update general_series
set visibility = '1'
where patient_pk_id in (
  select patient_pk_id 
  from patient_temp);
  
update general_image
set visibility = '1', curation_timestamp=CURRENT_TIMESTAMP()
where patient_pk_id in (
  select patient_pk_id 
  from patient_temp);

drop table patient_temp;
