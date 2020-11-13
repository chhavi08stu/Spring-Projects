CREATE TABLE public.shop
(
    id bigint NOT NULL,
    shopTitle character varying COLLATE pg_catalog."default",
    location character varying COLLATE pg_catalog."default",
    CONSTRAINT category_pkey PRIMARY KEY (id)
)
TABLESPACE pg_default;


CREATE TABLE public.owner
(
    id bigint NOT NULL,
    shopId bigint NOT NULL,
    name character varying COLLATE pg_catalog."default",
    phone bigint NOT NULL,
	countryCode character varying COLLATE pg_catalog."default",
	email character varying COLLATE pg_catalog."default",
	gst character varying COLLATE pg_catalog."default",
	pan character varying COLLATE pg_catalog."default",
	aadhar character varying COLLATE pg_catalog."default",
    CONSTRAINT "ownerpkey" PRIMARY KEY (id, shopId)
)

TABLESPACE pg_default;

CREATE TABLE public.ownerRegistration
(
    id bigint UNIQUE NOT NULL,
    ownerId bigint NOT NULL,
    referenceCode character varying COLLATE pg_catalog."default",
	registeredOn timestamp,
    CONSTRAINT "ownerpkey" PRIMARY KEY (ownerId, registeredOn)
)

TABLESPACE pg_default;



