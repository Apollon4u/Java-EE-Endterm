CREATE TABLE public.anime (
                              id bigint NOT NULL,
                              title character varying,
                              releaseDate character varying,
                              isReleased boolean,
                              user_id bigint
);

ALTER TABLE public.anime OWNER TO postgres;

ALTER TABLE public.anime ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.anime_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);