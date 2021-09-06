import React from 'react';
import { Text, View } from 'react-native';
import { ButtonFooter } from '../../components/ButtonFooter';
import { Footer } from '../../components/Footer';
import { Header } from '../../components/Header';
import { styles } from './styles';

export function Gallery() {
  return (
    <View style={styles.container}>
      
      <Header />
      
      <View style={styles.main}>
        <Text style={styles.text}>Gallery</Text>
      </View>
      
      <Footer />
    </View>
  )
}