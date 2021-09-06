import React from 'react';
import AppLoading from 'expo-app-loading';

import { useFonts, Inter_400Regular, Inter_600SemiBold } from '@expo-google-fonts/inter';

import { Routes } from './src/routes';
import { StatusBar, StyleSheet, View } from 'react-native';

export default function App() {
  const [fontsLoaded] = useFonts({
    Inter_400Regular,
    Inter_600SemiBold
  });

  if (!fontsLoaded) return <AppLoading />

  return (
    <View style={styles.container}>
      <StatusBar
        barStyle="light-content"
        backgroundColor="transparent"
        translucent
      />

      <Routes />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1
  },
});