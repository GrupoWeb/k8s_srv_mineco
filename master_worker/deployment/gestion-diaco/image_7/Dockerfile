FROM php:7.2-apache 
EXPOSE 80 443


COPY vhost.conf /etc/apache2/sites-available/000-default.conf 
COPY /ssl /etc/ssl/certs/

RUN a2enmod ssl


RUN apt-get update && apt-get install -y \
        libfreetype6-dev \
        libjpeg62-turbo-dev \
        libmcrypt-dev \
        libpng-dev \
        git \
        zip \ 
        unzip \
        libzip-dev \
        nano \
        python2  \
        iputils-ping  \
    && pecl install mcrypt-1.0.1  \
    && docker-php-ext-install -j$(nproc) iconv   \
    && docker-php-ext-install zip  \
    && docker-php-ext-install pdo_mysql   \
    && docker-php-ext-configure gd --with-freetype-dir=/usr/include/ --with-jpeg-dir=/usr/include/ \
    && docker-php-ext-install -j$(nproc) gd \
    && docker-php-ext-install bcmath \
    && docker-php-ext-enable mcrypt

RUN docker-php-ext-install mysqli pdo pdo_mysql

RUN apt-get -y install supervisor

RUN chown -R www-data:www-data /var/www/html \
    && a2enmod rewrite 

WORKDIR /var/www/html

RUN a2enmod headers \
   && service apache2 restart 
