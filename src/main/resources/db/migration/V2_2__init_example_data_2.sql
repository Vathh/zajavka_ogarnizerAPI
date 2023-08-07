insert into ogarnizer_order (created_by_user_id, created_date, priority_id, client_id, description, device, additional_info, update_info, stage_id) values
(2, '2020-02-02 22:22:22', 1, 2, 'procesor do laptopa', 'dell latitude 5490', '', '', 1),
(3, '2030-03-03 13:13:13', 2, 3, 'piec uzywany', 'bizhub 3020', 'aefaefaexae', 'qwe12easdasd', 2),
(1, '2040-04-04 14:14:14', 3, 1, 'rolka poboru papieru', 'hp 4200', '', 'fbq3ervqeQ', 3),
(5, '2050-05-05 15:15:15', 3, 5, 'folia do pieca', 'hp 2035', 'erbtertserctesrt', '', 4),
(4, '2060-06-06 15:15:15', 2, 4, 'toner + beben', 'ricoh mp501', 'asefasefxcaes', 'sertesrtert', 2);

insert into ogarnizer_closed_order (created_by_user_id, created_date, client_id, description, device, additional_info, update_info, closed_by_user_id, closed_date, success) values
(2, '2020-02-02 22:22:22', 1, 'procesor do laptopa', 'dell latitude 5490', '', '',  4, '2060-06-06 15:15:15', true),
(3, '2030-03-03 13:13:13', 2, 'piec uzywany', 'bizhub 3020', 'aefaefaexae', 'qwe12easdasd',  5, '2050-05-05 15:15:15', false),
(1, '2040-04-04 14:14:14', 3, 'rolka poboru papieru', 'hp 4200', '', 'fbq3ervqeQ',  1, '2040-04-04 14:14:14', false),
(5, '2050-05-05 15:15:15', 3, 'folia do pieca', 'hp 2035', 'erbtertserctesrt', '', 3, '2030-03-03 13:13:13', true),
(4, '2060-06-06 15:15:15', 2, 'toner + beben', 'ricoh mp501', 'asefasefxcaes', 'sertesrtert', 2, '2020-02-02 22:22:22', true);

insert into ogarnizer_away_work (created_by_user_id, created_date, priority_id, client_id, description, place, device, additional_info, update_info, stage_id) values
(5, '2090-09-09 19:19:19', 1, 1, 'do wymiany rolka poboru papieru', 'padma 3.0', 'bizhub c356', '', '', 1),
(4, '2080-08-08 18:18:18', 3, 2, 'do wymiany zolty beben', 'biuro na gorze', 'bizhub c234', 'wrtcywrdyww', 'wrtcywrtyvw', 2),
(3, '2070-07-07 17:17:17', 2, 3, 'brudzi na czarno', 'piwnica', 'hp 123', 'rtywrtyvwrtyr', '', 3),
(2, '2060-05-05 16:16:16', 1, 4, 'zaciecie w strefie bocznych drzwiczek', 'sekretariat', 'ricoh 9851', 'dsrftvyydrt', '', 4),
(1, '2050-03-03 13:13:13', 3, 5, 'nie pobiera papieru', 'magazyn', 'xerox 357', '', 'dfghdfhrv', 3);

insert into ogarnizer_closed_away_work (created_by_user_id, created_date, client_id, description, place, device, additional_info, update_info, closed_by_user_id, closed_date, success) values
(5, '2090-09-09 19:19:19', 1, 'do wymiany rolka poboru papieru', 'padma 3.0', 'bizhub c356', '', '', 4, '2060-06-06 15:15:15', true),
(4, '2080-08-08 18:18:18', 3, 'do wymiany zolty beben', 'biuro na gorze', 'bizhub c234', 'wrtcywrdyww', 'wrtcywrtyvw', 5, '2050-05-05 15:15:15', false),
(3, '2070-07-07 17:17:17', 2, 'brudzi na czarno', 'piwnica', 'hp 123', 'rtywrtyvwrtyr', '', 1, '2040-04-04 14:14:14', false),
(2, '2060-05-05 16:16:16', 1, 'zaciecie w strefie bocznych drzwiczek', 'sekretariat', 'ricoh 9851', 'dsrftvyydrt', '', 3, '2030-03-03 13:13:13', true),
(1, '2050-03-03 13:13:13', 3, 'nie pobiera papieru', 'magazyn', 'xerox 357', '', 'dfghdfhrv', 2, '2020-02-02 22:22:22', true);

insert into ogarnizer_service (created_by_user_id, created_date, priority_id, client_id, description, device, additional_info, update_info, stage_id) values
(3, '2013-03-03 13:13:13', 3, 3, 'brak zasilania', 'laptop dell latitude 5120', '', 'dsfcasfxa', 2),
(4, '2014-04-04 14:14:14', 2, 1, 'uszkodzona matryca', 'laptop hp', 'asdfxase', '', 3),
(5, '2015-05-05 15:15:15', 1, 2, 'nie dziala touchpad', 'komputer dell precision tower 8160', 'asdfxqwef', 'qwexfwxfawf', 4),
(1, '2011-11-11 11:11:11', 2, 5, 'brudzenie na wydruku', 'hp 2035', '', 'awefwaefwaef', 1),
(2, '2012-12-12 12:12:12', 3, 4, 'brudzi na zolto i czerwono', 'bizhub 3350', '', '', 2);

insert into ogarnizer_closed_service (created_by_user_id, created_date, client_id, description, device, additional_info, update_info, closed_by_user_id, closed_date, success) values
(3, '2013-03-03 13:13:13', 3, 'brak zasilania', 'laptop dell latitude 5120', '', 'dsfcasfxa', 4, '2012-12-12 12:12:12', false),
(4, '2014-04-04 14:14:14', 2, 'uszkodzona matryca', 'laptop hp', 'asdfxase', '', 5, '2011-11-11 11:11:11', false),
(5, '2015-05-05 15:15:15', 1, 'nie dziala touchpad', 'komputer dell precision tower 8160', 'asdfxqwef', 'qwexfwxfawf', 2, '2015-05-05 15:15:15', true),
(1, '2011-11-11 11:11:11', 2, 'brudzenie na wydruku', 'hp 2035', '', 'awefwaefwaef', 1, '2015-05-05 15:15:15', true),
(2, '2012-12-12 12:12:12', 3, 'brudzi na zolto i czerwono', 'bizhub 3350', '', '', 3, '2014-04-04 14:14:14', true);

insert into ogarnizer_user_role values
(1,1), (2,1), (3,1), (4,2), (5,2);

