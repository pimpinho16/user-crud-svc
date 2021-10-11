--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

-- Started on 2021-10-10 20:51:31

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4 (class 2615 OID 16408)
-- Name: user; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA "user";


ALTER SCHEMA "user" OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 202 (class 1259 OID 16411)
-- Name: svc_usr_user; Type: TABLE; Schema: user; Owner: postgres
--

CREATE TABLE "user".svc_usr_user (
    "usrAge" integer NOT NULL,
    "usrFirstName" character varying(100)[] NOT NULL,
    "usrId" integer NOT NULL,
    "usrLastName" character varying(100)[] NOT NULL,
    "usrCreateDate" time with time zone NOT NULL
);


ALTER TABLE "user".svc_usr_user OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16409)
-- Name: svc_usr_user_usrId_seq; Type: SEQUENCE; Schema: user; Owner: postgres
--

CREATE SEQUENCE "user"."svc_usr_user_usrId_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE "user"."svc_usr_user_usrId_seq" OWNER TO postgres;

--
-- TOC entry 2992 (class 0 OID 0)
-- Dependencies: 201
-- Name: svc_usr_user_usrId_seq; Type: SEQUENCE OWNED BY; Schema: user; Owner: postgres
--

ALTER SEQUENCE "user"."svc_usr_user_usrId_seq" OWNED BY "user".svc_usr_user."usrId";


--
-- TOC entry 2852 (class 2604 OID 16414)
-- Name: svc_usr_user usrId; Type: DEFAULT; Schema: user; Owner: postgres
--

ALTER TABLE ONLY "user".svc_usr_user ALTER COLUMN "usrId" SET DEFAULT nextval('"user"."svc_usr_user_usrId_seq"'::regclass);


--
-- TOC entry 2986 (class 0 OID 16411)
-- Dependencies: 202
-- Data for Name: svc_usr_user; Type: TABLE DATA; Schema: user; Owner: postgres
--

COPY "user".svc_usr_user ("usrAge", "usrFirstName", "usrId", "usrLastName", "usrCreateDate") FROM stdin;
\.


--
-- TOC entry 2993 (class 0 OID 0)
-- Dependencies: 201
-- Name: svc_usr_user_usrId_seq; Type: SEQUENCE SET; Schema: user; Owner: postgres
--

SELECT pg_catalog.setval('"user"."svc_usr_user_usrId_seq"', 1, false);


--
-- TOC entry 2854 (class 2606 OID 16419)
-- Name: svc_usr_user svc_usr_user_pkey; Type: CONSTRAINT; Schema: user; Owner: postgres
--

ALTER TABLE ONLY "user".svc_usr_user
    ADD CONSTRAINT svc_usr_user_pkey PRIMARY KEY ("usrId");


-- Completed on 2021-10-10 20:51:31

--
-- PostgreSQL database dump complete
--

