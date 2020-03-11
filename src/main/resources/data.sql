
INSERT INTO product(composition,description,name,price,stock,version,image)
VALUES('composition1','description','Burger',5.50,15,0,'pathToImg'),
('composition2','description','Burger',5.50,15,0,'pathToImg'),
('composition3','description','Croissant',5.50,15,0,'pathToImg'),
('composition4','description','Kebab',5.50,15,0,'pathToImg'),
('composition5','description','Coleslaw',5.50,15,0,'pathToImg'),
('composition6','description','Choucroute',5.50,15,0,'pathToImg'),
('composition7','description','Flammekuech',5.50,15,0,'pathToImg'),
('composition8','description','Pizza',5.50,15,0,'pathToImg'),
('composition9','description','Muffin',5.50,15,0,'pathToImg'),
('composition10','description','Eau plate',5.50,15,0,'pathToImg');

INSERT INTO days(jour,version)
VALUES('lundi',0),
('mardi',0),
('mercredi',0),
('jeudi',0),
('vendredi',0),
('samedi',0),
('dimanche',0);

INSERT INTO product_days(product_id,days_id)
VALUES(1,1),
(1,3),
(1,4),
(2,1),
(3,1),
(1,6),
(5,1),
(8,2),
(8,1),
(7,2),
(9,1),
(10,1);

INSERT INTO actualite(date_creation,date_fin_validite,description,image_url,title,user_creation)
VALUES('2010-10-10','2020-10-10','La meilleure pizza enfin disponible','img','New pizza',1),
('2010-10-10','2020-10-10','Le meilleur burger enfin disponible','img','New pizza',1),
('2010-10-10','2020-10-10','La meilleure sauce enfin disponible','img','New sauce',1);

INSERT INTO address(city,country,is_billing_adress,number,street,version,zip_code,user_id)
VALUES('Paris','France',true,5,'rue des champs',0,'75001',1),
('Lyon','France',true,5,'rue des champs',0,'75001',1),
('Marseille','France',true,5,'rue des champs',0,'75001',1),
('Lille','France',true,5,'rue des champs',0,'75001',1),
('Paris','France',true,5,'rue des chatons',0,'75001',1);

INSERT INTO gender(gendername,version)
VALUES('homme',0),('femme',0);

INSERT INTO meal_time(active,label,version)
VALUES(true,'petit-déjeuner',0),
(true,'déjeuner',0),
(true,'gouter',0),
(true,'diner',0);

INSERT INTO meal_type(active,label,version)
VALUES(true,'entrée',0),
(true,'plat',0),
(true,'dessert',0),
(true,'boisson',0),
(true,'viennoiserie',0);

INSERT INTO mealtime_mealtype(mealtime_id,mealtype_id)
VALUES(1,4),
(1,5),
(2,2),
(2,3),
(2,4),
(4,2),
(4,3);

INSERT INTO order_header(is_delivered,order_date,receipt_number,total_price,version,billing_address_id,delivery_address_id,mealtime_id,user_id)
VALUES(true,'2010-10-10',123,15,0,1,2,2,1),
(true,'2010-11-10',124,25,0,1,2,3,1);

INSERT INTO order_line(quantity,unit_price,version,order_header_id,product_id)
VALUES(2,5.50,0,1,1),
(4,5.50,0,1,2),
(1,5.50,0,1,3),
(4,5.50,0,2,2),
(2,5.50,0,2,1);

INSERT INTO product_mealtypes(product_id,mealtypes_id)
VALUES(1,2),
(2,2),
(3,4),
(4,2),
(5,2),
(6,2),
(9,5);

INSERT INTO profile(role,version)
VALUES('admin',0),
('user',0);

INSERT INTO rating(comment,grade,version,product_id,user_id)
VALUES('Great !',4.5,0,1,1),
('Bof !',2.5,0,2,1),
('Nul !',1.5,0,1,2),
('Awesome !',5,0,3,1);

INSERT INTO society(name,version)
VALUES('Ubisoft',0);

INSERT INTO foodtruck.user(birthday,email,firstname,name,password,phonenumber,gender_id,profile_id,society_id)
VALUES('1960-10-10','bla@bla.fr','Haddock','Capitaine','123','06060606',1,1,1),
('1999-10-10','bla@bla.fr','Tournesol','Professeur','123','06060606',1,1,null),
('1960-10-10','admin@bla.fr','Admin','Admin','123','06060606',1,2,null);




