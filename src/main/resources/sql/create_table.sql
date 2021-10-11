CREATE TABLE "user".svc_usr_user
(
    "usrAge" integer NOT NULL,
    "usrFirstName" character varying(100)[] NOT NULL,
    "usrId" serial NOT NULL,
    "usrLastName" character varying(100)[] NOT NULL,
    "usrCreateDate" time with time zone NOT NULL,
    PRIMARY KEY ("usrId")
);

